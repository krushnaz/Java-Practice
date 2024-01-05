import os
def process (request):
  foo_var = os.environ.get('foo','specified enveirnment is not set.')
  return 'foo:{}'.format(foo_var)